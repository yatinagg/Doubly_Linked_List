class DoublyLinkedList {
    /**
     * Node Class
     * @param data data value of the Node
     */
    class Node(var data: Int) {
        var previous: Node? = null
        var next: Node? = null
    }

    private var head: Node? = null
    private var tail: Node? = null

    /**
     * Function for adding node in the list
     * @param data data value to be added
     */
    fun addNode(data: Int) {
        val newNode = Node(data)
        // if linked list is empty
        if (head == null) {
            head = newNode
            tail = newNode
            head?.previous = null
            tail?.next = null
        }
        // if linked list is not empty
        else {
            tail?.next = newNode
            newNode.previous = tail
            tail = newNode
            tail?.next = null
        }
    }

    /**
     * function to display the doubly linked list
     */
    fun display() {
        var current: Node? = head
        if (head == null) return println("List is empty")
        println("Nodes of doubly linked list are : ")
        // iterating over the nodes
        while (current != null) {
            print("${current.data} ")
            current = current.next
        }
    }
}

/**
 * main function
 */
fun main() {
    val doublyLinkedList = DoublyLinkedList()
    doublyLinkedList.addNode(1)
    doublyLinkedList.addNode(2)
    doublyLinkedList.addNode(4)
    doublyLinkedList.addNode(3)
    doublyLinkedList.addNode(5)
    doublyLinkedList.display()
}