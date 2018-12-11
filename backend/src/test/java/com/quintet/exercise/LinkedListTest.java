/*
 * For personal use;
 */

package com.quintet.exercise;

import com.quintet.exercise.BasicStructure.SinglyLinkedListNode;
import org.junit.Test;

import javax.validation.constraints.NotNull;
import java.util.Stack;

public class LinkedListTest {


    @Test
    public void reverLinkedListTest() {
//        reverseList();
    }

    public SinglyLinkedListNode reverseList(@NotNull SinglyLinkedListNode head) {
        if (head == null || head.next == null)
            return head;
        SinglyLinkedListNode prev = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return prev;
    }

    public void stackTest() {
        Stack
    }
}
