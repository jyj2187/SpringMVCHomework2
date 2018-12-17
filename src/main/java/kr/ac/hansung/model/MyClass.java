package kr.ac.hansung.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MyClass {
	// id , 수강년도, 학기, 교과코드 , 교과목명, 구분, 학점.

		private int id;
		private int year; // 년도
		private int semester; // 학기
		private String code; // 과목코드
		private String name; // 과목명
		private String course; // 이수 구분별 과목
		private int credit; // 학점
}
