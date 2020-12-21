package datastructure.liner.linkedlist;

//一个节点
public class LoopNode {

    //节点内容
    int data;
    //下一个节点!!!
    LoopNode next=this;

    public LoopNode(int data) {
        this.data = data;
    }

    //插入一个节点作为当前节点的下一个节点
    public void after(LoopNode node){
        //取出下一个节点作为下下个节点
        LoopNode nextNext=next;
        //把新结点作为当前结点的下一个节点
        this.next=node;
        node.next=nextNext;
    }

    //删除下一个节点
    public void removeNext() {
        //取出下下一个节点
        LoopNode newNext = next.next;
        //把下下个节点设置为当前的下一个节点
        this.next = newNext;
    }

    //获取下一个节点
    public LoopNode next() {
        return this.next;
    }

    //获取节点的数据
    public int getData() {
        return this.data;
    }

    //当前节点是否为最后一个节点
    public boolean isLast() {
        return this.next == null;
    }
}
