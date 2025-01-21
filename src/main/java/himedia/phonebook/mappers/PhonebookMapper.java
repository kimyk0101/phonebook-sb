package himedia.phonebook.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import himedia.phonebook.repository.vo.PhonebookVo;

//	이 mapper interface를 mybatis mapper 설정의 namespace로 등록해야 한다.
@Mapper	//	MyBatis Mapper
public interface PhonebookMapper {
//	<select id="selectAll" resultType="phonebookVo"> 1:1 매칭
	List<PhonebookVo> selectAll();
}
