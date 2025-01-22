package himedia.phonebook.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import himedia.phonebook.repository.vo.PhonebookVo;

//	이 mapper interface를 mybatis mapper 설정의 namespace로 등록해야 한다.
@Mapper	//	MyBatis Mapper
public interface PhonebookMapper {
//	<select id="selectAll" resultType="phonebookVo"> 1:1 매칭
	List<PhonebookVo> selectAll();
	
//	<insert id="insert" parameterType="phonebookVo">
	int insert(PhonebookVo phonebookVo);
	
//	<select id="selectOne" parameterType="int" resultType="phonebookVo">
//	@Select("SELECT * FROM phonebook WHERE id=#{id}")	->	이렇게 쓰면 mapper 없이 사용 가능 
	PhonebookVo selectOne(Integer id);
	
//	<update id="update" parameterType="phonebookVo">
	int update(PhonebookVo phonebookVo);
	
//	<delete id="delete" parameterType="int">
	int delete(Integer id);
}
