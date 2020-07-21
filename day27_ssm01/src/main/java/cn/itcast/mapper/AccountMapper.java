package cn.itcast.mapper;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {

    public void transferIn(@Param("inName") String inName, @Param("money") double money);

    public void transferOut(@Param("outName") String outName, @Param("money") double money);
}
