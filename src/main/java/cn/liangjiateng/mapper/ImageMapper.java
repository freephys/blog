package cn.liangjiateng.mapper;

import cn.liangjiateng.pojo.DO.Image;
import cn.liangjiateng.util.Page;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ImageMapper {

    @Select("select count(*) from image")
    long countImages();

    @Select("select * from image where id = #{id}")
    Image getImageById(int id);

    @Select("select * from image order by create_time desc order by #{limit}, #{pageSize}")
    List<Image> listImages(Page page);

    @Insert("insert into image(name, url) values(#{name}, #{url})")
    void insertImage(Image image);

    @Delete("delete from image where id = #{id}")
    void deleteImageById(int id);
}