import java.util.Arrays;

public class MyList<T> {
	
	T data;
	MyList<T> tail;

	public MyList() {
		data = null;
		tail = null;
	}
	

	public MyList(T data) {
		this.data = data;
		tail = new MyList<T>();
	}
	
	

	public MyList(T[] v) {
		if (v == null) {
				data = null;
				tail = null;
	}
		else {
			MyList<T> temp = this;  // Initial
			for (int i = 0;i<v.length;i++) {
				temp.data = v[i];
				temp.tail = new MyList<T>();
				temp=temp.tail;
			}
			
		}
	}
	
	@Override
	public String toString() {
		return "[" + data + ", " + tail + "]";
	}

	public boolean isEmpty() {
		if(this.data == null && this.tail == null) {
		return true;}
		else return false;
	}
	

	public Object[] toArray(){
		Object[]w = new Object[0];
		MyList<T> list = this;
		while(!list.isEmpty()) {
			w= Arrays.copyOf(w, w.length+1);
			w[w.length-1]=list.data;
			list = list.tail;

		}
		return w;
	}
	

	public MyList<T> copy(){
		MyList<T> r = new MyList<T>();
		MyList<T> wt = this;
		MyList<T> wr = r;
		while(!wt.isEmpty()) {
			wr.data=wt.data;
			wr.tail= new MyList<T>();
			wr=wr.tail;
			wt=wt.tail;
		}
		return r;
	}
	

	public T head() {
		MyList<T> list = this;
		if(list.isEmpty()) {
			return data = null;
		}
		else {
			return list.data = data;
		}
	}
	

	public MyList<T> tail(){
		MyList<T> list = new MyList<T>();
		if(this.tail.isEmpty()) {
			return this;
		}
		else {			
			list=this.tail;
			return list.tail();
		}
		
		
	}
	

	public T end() {
		return this.tail().data;
	}
	

	public void append(T data) {
		if(this.isEmpty()) {
			this.data = data;
			this.tail = new MyList<T>();
		}
		else {
			MyList <T> tailtemp = this.tail();
			tailtemp.tail.data = data;
			tailtemp.tail.tail = new MyList<T>();
		}
		
	}
	

	public void concat (MyList<T> lc) {
		if(this.isEmpty()) {
			this.data = lc.data;
			this.tail = lc.tail;
		}
		else {
			MyList <T> tailtemp = this.tail();
			tailtemp.tail = lc;
		}
	}
	
	public MyListIterator<T> iterator(){
		MyList<T> list = this;
		MyListIterator<T> itr = new MyListIterator<T>(list);
		return itr;
	}
}	
