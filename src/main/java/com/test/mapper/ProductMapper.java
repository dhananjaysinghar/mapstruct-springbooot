package com.test.mapper;

import com.test.dto.Product;
import com.test.entity.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {

    @Mapping(source = "product.productNumber", target = "productId")
    ProductEntity toProduct(Product product);

    @InheritInverseConfiguration
    Product toProductEntity(ProductEntity productEntity);
}
