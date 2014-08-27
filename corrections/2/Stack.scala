package exo

import java.util.ArrayList

class Stack[A]{

  private val lst = new ArrayList[A]()

  def isEmpty = lst.isEmpty
  def size = lst.size

  def push( a: A ): Unit = lst.add(a)

  def pop(): A = {
    val last = size - 1
    val a = lst.get( last )
    lst.remove( last )
    a
  }

  def swap(): Unit = {
    if( size >= 2 ) {
      val a = pop()
      val b = pop()
      push(a)
      push(b)
    }
  }


}
