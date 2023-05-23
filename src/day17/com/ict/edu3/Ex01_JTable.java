package day17.com.ict.edu3;

import javax.swing.table.AbstractTableModel;

//	테이블을 만들기 위해서는 AbstractTableModel 상속받자
//	AbstractTableModel =>추상클래스
public class Ex01_JTable extends AbstractTableModel{

//	1. 컬럼명(열의 대표적인 이름)을 배열로 만든다
	String[] name = {"번호","아이디","패스워드","나이","성별"};
	
//	행과 열이 있어서 표를 만들땐 2차원 배열로 만든다.
	String[][] data = {
			{"1","aaaa","a111","12","true"},
			{"2","bbbb","b111","15","false"},
			{"3","cccc","c111","17","true"},
			{"4","dddd","d111","28","false"}
	};
	
//	행의 개수 = row = 줄
	@Override
	public int getRowCount() {
		return data.length;  //data길이만큼 생성
	}
	
//	열의 개수 = column = 칸
	@Override
	public int getColumnCount() {
		return name.length;  //name길이만큼 생성
	}
	
//	내용 삽입
	@Override
	public String getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}
	
//	내용 수정 셋투셋투
	@Override
		public boolean isCellEditable(int rowIndex, int columnIndex) {
			if (columnIndex != 0) {
				return true;  //true로 수정하면 수정됨
			}else {
				return false;
			}
		}
//	내용 수정 적용 셋투
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		if (columnIndex != 0) {  //첫번째 열은 수정 안됨
			data[rowIndex][columnIndex] = (String)aValue;  //(String)=> 객체(클래스형)만 받음
		}
	}
	
//	컬럼명(제목칸) 붙이기
	@Override
		public String getColumnName(int column) {
			return name[column];  //name이 배열이므로 []로 수정
		}
}
