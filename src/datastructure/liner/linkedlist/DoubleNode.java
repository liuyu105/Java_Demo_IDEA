package datastructure.liner.linkedlist;

public class DoubleNode {
    //上一个节点
    DoubleNode pre = this;
    //下一个节点
    DoubleNode next = this;
    //节点数据
    int data;

    public DoubleNode(int data){
        this.data=data;
    }

    //增加节点
    public void after(DoubleNode node){
        //原来的下一个节点
        DoubleNode nextNext=next;
        //新结点作为当前节点的下一节点
        this.next=node;
        //把当前节点作为新结点的前一节点
        node.pre=this;

        //让nextNext作为新结点的下一个节点
        node.next=nextNext;
        nextNext.pre=node;

    }

    //获取下一个节点
    public DoubleNode next(){
        return this.next;
    }
    //获取上一个节点
    public DoubleNode pre(){
        return this.pre;
    }

    //获取数据
    public int getData(){
        return this.data;
    }

}
