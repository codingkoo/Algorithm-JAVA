package data_structure.list.linkedList;

import java.util.ListIterator;

public class LinkedList {
	private Node head;
	//tail 객체를 생성하지 않는다면, 뒤에 추가할때마다 head->마지막까지 계속 탐색해야하는 불상사가 일어남.
	private Node tail;
	private int size = 0;
	
	// Node 객체 선언
	private class Node{
		//데이터가 저장될 필드
		private Object data;
		//다음 노드를 가리키는 필드
		private Node next;
		
		//Node 객체가 생성될때 객체를 초기화하는 역할, input은 Node가 생성될때 처음으로 갖고있는(입력된) 값을 뜻함
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		
		//Node 객체 내의 data를 살펴보기 쉽게하기 위한 메서드
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	
	//-------추가 관련 메서드
	
	// Node List의 처음에 Node를 추가하는 메서드
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		//가장 처음 생성되는 1번 node의 Next는 null, 이후의 node들은 head값(i-1번째)을 next로 가짐
		newNode.next = head;
		
		//윗 줄 실행 이후, head도 다음 Node객체로 갱신
		head = newNode;
		
		// 새로운 노드가 생성되었으니 사이즈값 증가 
		size++;
		
		// 만일 노드가 단 1개 뿐이라면, 그 노드가 head이자 tail임.
		if(head.next == null) {
			tail = head;
		}
	}
	
	// Node List의 마지막에 Node를 추가하는 메소드
	public void addLast(Object input) {
		Node newNode = new Node(input);
		//데이터 비어있는 처음 상태라면, 편의를 위해 미리 구현해놓은 addFirst를 사용해서 데이터를 추가
		//객체가 1개뿐이라면 그 자신이 head이자, tail이니 addFirst를 사용해도 무방
		if(size == 0) {
			addFirst(input);
		} else {
			//노드를 뒤에 추가하는 것이니, 가장 마지막 tail은 가장 최근에 생성된 노드 값이 됨.
			tail.next = newNode;
			tail = newNode;
			
			// 새로운 노드가 생성되었으니 사이즈 값 증가
			size++;
		}
	}
	
	//index 번째에 있는 Node 객체를 뽑아내는 메소드(내부에서만 사용하기 때문에 public을 붙이지 않음)
	Node node(int index) {
		Node x = head;
		//head부터 시작, index 만큼 다음 객체를 탐색해서 결국 원하는 객체(x)를 추출해냄
		for(int i=0; i < index; i++) {
			x = x.next;
		}
		return x;
	}
	
	// Node List 사이에 노드를 추가하는 메서드
	public void add(int index, Object input) {
		if(index == 0) {
			addFirst(input);
		} else {
			Node aheadOne = node(index-1);
			Node behindOne = aheadOne.next;
			Node newNode = new Node(input);
			aheadOne.next = newNode;
			newNode.next = behindOne;
			size++;
			
			//만일 제일 끝에 추가한다면
			if(newNode.next == null) {
				tail = newNode;
			}
		}
	}
	
	// -------Util성 메소드
	// Linked List를 하나의 String으로 반환하는 함수
	public String toString() {
		// 빈 리스트라면
		if( head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";
		
		//Linked리스트를 전부 순차적으로 탐색
		while(temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		
		//마지막 Node는 수동으로 데이터를 1번 추가해줌
		str += temp.data;
		
		return str + "]";
	}
	
	
	// -------삭제 관련 메소드
	
	// 첫번째 Node를 삭제하는 메소드
	// JAVA에서는 Remove를 했을 때, 삭제된 Node가 갖고 있었던 값을 돌려주게 되어있다. 따라서 Object를 반환.
	public Object removeFirst() {
		Node temp = head;
		head = head.next;
		//JAVA의 규칙에 따라 돌려주기 위한 데이터를 Object Type으로 저장
		Object returnData = temp.data;
		temp = null;
		size--;
		return returnData;
		
	}
	
	// 특정한 위치의 Node를 삭제하는 메소드
	public Object remove(int index) {
		if(index == 0) {
			return removeFirst();
		}
		
		Node temp = node(index-1);
		Node todoDeleted = temp.next;
		temp.next = temp.next.next;
		Object returnData = todoDeleted.data;
		
		//만일 삭제하려는 노드가 가장 마지막 노드라면
		if(todoDeleted.next == tail) {
			tail = temp;
		}
		todoDeleted = null;
		size--;
		return returnData;
	}
	
	// 마지막 Node를 삭제하는 메소드
	public Object removeLast() {
		return remove(size-1);
	}
	
	// ------ 엘리먼트 관련 메소드
	
	//엘리먼트의 크기
	public int size() {
		return size;
	}
	
	//엘리먼트 가져오기
	public Object get(int index) {
		Node temp = node(index);
		return temp.data;
	}
	
	// ------ 탐색 관련 메소드
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;
		while(temp.data != data) {
			temp = temp.next;
			index++;
			
			//가장 끝에 있는 node에 도달했을 경우 : 없는 값이여서 못 찾았을 경우
			if(temp == null) {
				//-1을 return해서 검색을 종료시킴
				return -1;
			}
		}
		return index;
	}
}


