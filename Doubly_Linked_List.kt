class DoublyLinkedList<T> {
    /**
     * Node Class
     * @param data data value of the Node
     */
    class Node<T>(var data: T) {
        var previous: Node<T>? = null
        var next: Node<T>? = null
    }

    var head: Node<T>? = null
    var tail: Node<T>? = null

    /**
     * Function for adding node in the start of the linked list
     * @param data data value to be added
     */
    fun insertStart(data: T) {
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
            head?.previous = newNode
            newNode.next = head
            head = newNode
            head?.previous = null
        }
    }

    /**
     * Function for adding node in the end of the linked list
     * @param data data value to be added
     */
    fun insertEnd(data: T) {
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
     * Function for removing the node from the linked list
     * @param node node to be removed
     */
    fun removeNode(node: Node<T>?) {

        if (head == null || node == null) return

        if (head == node) head = node.next;

        if(node.next != null) node.next!!.previous = node.previous

        if(node.previous != null) node.previous!!.next = node.next
    }

    /**
     * function to display the doubly linked list using forward traversal
     */
    fun forwardTraversal() {
        var current: Node<T>? = head
        if (head == null) return println("List is empty")
        println("Nodes of doubly linked list are : ")
        // iterating over the nodes
        while (current != null) {
            print("${current.data} ")
            current = current.next
        }
        println()
    }


    /**
     * function to display the doubly linked list using reverse traversal
     */
    fun reverseTraversal() {
        var current: Node<T>? = tail
        if (tail == null) return println("List is empty")
        println("Nodes of doubly linked list are : ")
        // iterating over the nodes
        while (current != null) {
            print("${current.data} ")
            current = current.previous
        }
        println()
    }
}

/**
 * main function
 */
fun main() {
    val doublyLinkedList = DoublyLinkedList<Any>()
    doublyLinkedList.insertStart(1)
    doublyLinkedList.insertStart(2)
    doublyLinkedList.insertEnd("Hello")
    doublyLinkedList.insertEnd(3)
    doublyLinkedList.insertEnd("5a")
    doublyLinkedList.forwardTraversal()
    doublyLinkedList.reverseTraversal()
    doublyLinkedList.removeNode(doublyLinkedList.head)
    doublyLinkedList.forwardTraversal()
    doublyLinkedList.removeNode(doublyLinkedList.tail)
    doublyLinkedList.forwardTraversal()
    doublyLinkedList.reverseTraversal()
}