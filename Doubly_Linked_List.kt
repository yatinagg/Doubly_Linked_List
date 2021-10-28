class DoublyLinkedList {
    class Node(var data: Int) {
        var previous: Node? = null
        var next: Node? = null
    }

    private var head: Node? = null
    private var tail: Node? = null

    fun addNode(data: Int) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
            tail = newNode
            head?.previous = null
            tail?.next = null
        } else {
            tail?.next = newNode
            newNode.previous = tail
            tail = newNode
            tail?.next = null
        }
    }

    fun display() {
        var current: Node? = head
        if (head == null) return println("List is empty")
        println("Nodes of doubly linked list are : ")
        while (current != null) {
            print("${current.data} ")
            current = current.next
        }
    }
}


fun main() {
    val dList = DoublyLinkedList()
    dList.addNode(1)
    dList.addNode(2)
    dList.addNode(4)
    dList.addNode(3)
    dList.addNode(5)
    dList.display()
}