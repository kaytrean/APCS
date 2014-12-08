
public class sarray {
    private String[] data; 
    private int last;
    public Sarray() {
	data = new String[10];
	for (int i=0;i<10;i++) {
	    data[i] = "";
	}
    }
    
    public Sarray(int i) {
	data = new String[i];
	for (int x=0;x<i;x++) {
	    data[x] = "";
	}
    }

    public String[] getData(){
	return data;
    }

    public void findLast() {
	int pos = 0;
	for(int i=data.length;i>0;i--) {
	    if (!(data[i].isEmpty())) {
		pos = i;
	    }
	}
	last = pos;
    }
    public String toString() {
	String s = "";
	for(int i=0;i<data.length;i++) {
	    if (i == data.length -1) { 
		s = s + " " + data[i]; 
	    }
	    else {s = s + " " +  data[i];}
	}
	return s;
    }

    public String[] shift(int start, int end) {
	String[] storage = new String[end - start];
	int index = -1;
	for(int i=start;i<end;i++) {
	    index += 1;
	    storage[index] = data[i];
	}
	return storage;
    }

    public boolean add(String i) {
	if(last == 0) {
	    data[0] = i;
	}
        else if(data.length <= last) {
	    String[] storage = shift(0, last);
	    data = new String[data.length + 1];
	    for(int x=0;x<storage.length;x++){
		data[x] = storage[x];
	    }
	    data[last + 1] = i;
	} 
	else {
	    data[last + 1] = i;
	}
	return true;
    }
    
    public void add(int index, String i) {
        String[] storage = shift(index, data.length);
	data[index] = i;
	int index2 = -1;
	for(int x=index+1;x<data.length;x++) {
	    index2 += 1;
	    data[x] = storage[index2];
	}
    }

    public String get(int index) {
	return data[index];
    }

    public void set(int index, String i) {
	data[index] = i;
    }

    public int size() {
        int size = 0;
	for(int i=0; i<data.length; i++) {
	    if (!(data[i].isEmpty())) {
		size += 1;
	    }
	}
	return size;
    }

    public void remove(int index) {
	data[index] = "";
    }

    public void isort(){
	for (int i=1;i<data.length;i++) {
	    String temp = data[i];
	    int j;
	    for (j=i-1;j>-1 && data[j].compareTo(temp) > 0;j--) {
		data[j+1] = data[j];
	    }
	    data[j+1] = temp;
	}
    }
    public void ssortDescending(){
	for (int i=0;i<data.length;i++){
	    String temp = "";
	    for (int j=0;j<data.length;j++){
		if (data[j].compareTo(data[i]) < 0){
		    temp = data[i];
		    data[i] = data[j];
		    data[j] = temp;
		}
	    }

	}
    }
    
    public void ssortAscending(){
	for (int i=0;i<data.length;i++){
	    String temp = "";
	    int index;
	    for (int j=0;j<data.length;j++){
		if (data[j].compareTo(data[i]) > 0){
		    index = j;
		    temp = data[i];
		    data[i] = data[index];
		    data[index] = temp;
		}
	    }

	}
    }
}