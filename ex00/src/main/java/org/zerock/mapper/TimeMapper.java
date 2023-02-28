package org.zerock.mapper;

// mapper 인터페이스를 통해 timemapper.xml 호출하는 것임
// 그럼 이게 mapper 라고 스프링에게 알려줘야 함 -> root-context 에 선언해주는 것임
public interface TimeMapper {
	public String getTime(); // 메소드, 아이디명이 일치해야 함
}
