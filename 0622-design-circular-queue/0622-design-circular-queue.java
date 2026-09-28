class MyCircularQueue {
    int [] arr;
    int front;
    int rear;
    int k;
    int size;

    public MyCircularQueue(int k) {
        this.k = k;
        arr = new int[k];
        front = -1;
        rear = -1;
        size = 0;

    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if (front == -1){
            front = 0;
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear+1)%k;
        arr[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        int result = arr[front];

        if(rear == front){
            rear = front = -1;
        }
    else{
        front = (front+1)%k;
    }
    size--;
    return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }
    
    public boolean isEmpty() {
        if(rear== -1 && front == -1){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if((rear+1)%k == front){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */