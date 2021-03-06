package com.parvez.dao;

import com.parvez.domain.ProductSummary;
import com.parvez.domain.User;
import java.util.List;

/**
 *
 * @author Parvez
 */
public interface ProductSummaryDao {

    void save(ProductSummary s);

    void update(ProductSummary s);

    public void updateWhenSales(ProductSummary s);

    void delete(int id);

    List<ProductSummary> getList();

    User getProductSummary(int id);

    public ProductSummary getProductSummaryByProductCode(String productCode);

    public ProductSummary getProductSummaryById(int id);
}
