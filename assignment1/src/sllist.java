
public class sllist {
	public slnode head;
	public sllist(){
		this.head=null;
	}
	
	//insert the front
	public void insertf(int a) {
		slnode nh = new slnode(a);
		nh.next = this.head;
		this.head = nh;
	}
	
	public void prtlist() {
		if (this.head==null) {
			System.out.println("Void List");
		}else{
			slnode cur = this.head;
			while(cur != null) {
				System.out.print(cur.value);
				System.out.print(' ');
				cur=cur.next;
			}
			System.out.println();
		}
	}
	
	public int getlen() {
		slnode cur = this.head;
		int len = 0;
		while(cur != null) {
			len += 1;
			cur = cur.next;
		}
		return len;
	}
	
	//selection sort
	public void slsort(){
		if (this.head!=null && this.head.next!=null){
			slnode cur_head = this.head;
			while (cur_head.next!=null) {
				slnode cl = cur_head;
				slnode min = cl;
				slnode ch = cl.next;
				while (ch!=null) {
					if (ch.value<min.value) {
						min = ch;
					}
					ch = ch.next;
				}
				cur_head = this.swapnode(cl, min);
				cur_head=cur_head.next;
			}
		}
	}
	
	public slnode swapnode(slnode cl, slnode min) {
		if (cl==min) {
			return cl;
		} else {
			slnode p0 = this.head;
			slnode p1 = cl.next;
			slnode p2 = this.head;
			if (cl==this.head) {
				if (cl.next==min) {
					cl.next = min.next;
					min.next = cl;
					this.head = min;
				} else {
					while (p2.next!=min) {
						p2 = p2.next;
					}
					if (p1==p2) {
						p1.next = min.next;
						min.next = cl;
						this.head = min;
					} else {
						p2.next = min.next;
						min.next = cl;
						this.head = min;
					}
				}
			} else {
				while (p0.next!=cl) {
					p0 = p0.next;
				}
				while (p2.next!=min) {
					p2 = p2.next;
				}
				if (cl.next==min) {
					cl.next = min.next;
					min.next = cl;
					p0.next = min;
				} else {
					if (p1==p2) {
						p1.next = min.next;
						min.next = p1;
						p0.next = min;
						cl.next = p1.next;
						p1.next = cl;
					} else {
						p2.next = min.next;
						min.next = p1;
						p0.next = min;
						cl.next = p2.next;
						p2.next = cl;
					}
				}
			}
			return min;
		}
		//System.out.println(this.head.value);
	}
	//value change version
	/**
	public void slsort(){
		if (this.head!=null && this.head.next!=null){
			slnode cl = this.head;
			while (cl.next!=null) {
				slnode min = cl;
				slnode ch = cl.next;
				while (ch!=null) {
					if (ch.value<min.value) {
						min = ch;
					}
					ch = ch.next;
				}
				int tmpv = min.value;
				min.value=cl.value;
				cl.value=tmpv;
				
				cl=cl.next;
			}
		}
	}
	*/

}
