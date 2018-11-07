package edu.luc.cs271.linkedstack;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  private int size = 0;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // DONE
    top = new Node<E>(obj, top);
    size++;
    return obj;
  }

  @Override
  public E peek() {
    // DONE
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    return top.data;
  }

  @Override
  public E pop() {
    // DONE
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    else {
    Node<E> newTop = top;

    top = top.next;
    size--;
    return newTop.data;
  }
  }

  @Override
  public boolean isEmpty() {
    // DONE
    if (top == null) {
      return true;
    } else {
      return false;
    }
  }

 @Override
    public List<E> asList() {
        final ArrayList<E> result = new ArrayList<>(size);
        populateList(top, result); // TODO replace null with the right reference
        return result;
    }

    private void populateList(final Node<E> curr, final List<E> result) {
        if(curr == null){
            return;
        }
        else{
            result.add(curr.data);
            populateList(curr.next, result);
        }
    }

    @Override
    public List<E> asFifoList() {
        final ArrayList<E> result = new ArrayList<>(size);
        populateFifoList(top, result); // TODO replace null with the right reference
        return result;
    }

    private void populateFifoList(final Node<E> curr, final List<E> result) {
        if(curr == null){
            return;
        }
        else{
         
            E data = curr.data;
            populateFifoList(curr.next, result);
            result.add(data);
        }
    }
}