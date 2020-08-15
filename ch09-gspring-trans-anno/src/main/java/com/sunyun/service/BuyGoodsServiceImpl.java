package com.sunyun.service;

import com.sunyun.dao.GoodsDao;
import com.sunyun.dao.SaleDao;
import com.sunyun.domain.Goods;
import com.sunyun.domain.Sale;
import com.sunyun.excep.NotEnoughException;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;


    /**
     * rollbackFor : 表示发生指定异常一定回滚
     *      处理逻辑：
     *      1）spring框架首先会检查方法抛出的异常是不是在rollbackFor属性值中
     *      如果在rollbackFor列中，不管是神恶魔类型的异常，一定回滚。
     *      2）如果抛出的异常不再rollbackFor中，spring会判断异常是不是RuntimeException，如果是，一定回滚。
     *
     * @param goodsId
     * @param nums
     */
//    @Transactional(
//            propagation = Propagation.REQUIRED,
//            isolation = Isolation.DEFAULT,
//            readOnly = false,
//            rollbackFor = {
//                    NullPointerException.class,NotEnoughException.class
//            }
//    )
    @Transactional //等同于默认值  位置在public有事务的方法上面
    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("buy方法的开始========");
        //记录销售的信息，向sale表添加激励
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);

        //更新库存
        Goods goods = goodsDao.selectGoods(goodsId);
        if(goods==null){
            //商品不在
            throw  new NullPointerException("编号是："+goodsId+"，商品不存在");

        }else  if(goods.getAmount() < nums){
            //商品库存不足
            throw new NotEnoughException("编号是："+goodsId+"商品库存不足");
        }

        //修改库存
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("buy方法的完成========");

    }
    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
