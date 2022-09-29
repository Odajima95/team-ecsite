package jp.co.internous.wings.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import jp.co.internous.wings.model.domain.MstProduct;

@Mapper
public interface MstProductMapper {
	List<MstProduct> findByProductName(@Param("productNames") String[] productNames );
	
	List<MstProduct> findByCategoryId(@Param("categoryId") int categoryId);
	
	List<MstProduct> findByCategoryIdAndProductName(@Param("categoryId") int categoryId ,@Param("productNames") String[] productNames );
	
	List<MstProduct> findAll();
	
	MstProduct  findById(@Param("id") int id);
	
}
