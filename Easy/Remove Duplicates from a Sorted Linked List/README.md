<h2><a href="https://www.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1?page=1&category=Linked%20List&sortBy=submissions">Remove Duplicates from a Sorted Linked List</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a singly linked list consisting of <strong style="user-select: auto;">N</strong> nodes. The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).</span><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note:</strong> Try not to use extra space. The nodes are arranged in a <strong style="user-select: auto;">sorted </strong>way.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>LinkedList: 2-&gt;2-&gt;4-&gt;5
<strong style="user-select: auto;">Output: </strong>2 4 5<strong style="user-select: auto;">
Explanation: </strong>In the given linked list 
2 -&gt;2 -&gt; 4-&gt; 5, only 2 occurs more 
than 1 time. So we need to remove it once.</span>
</pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>LinkedList: 2-&gt;2-&gt;2-&gt;2-&gt;2
<strong style="user-select: auto;">Output: </strong>2<strong style="user-select: auto;">
Explanation: </strong>In the given linked list 
2 -&gt;2 -&gt;2 -&gt;2 -&gt;2, 2 is the only element
and is repeated 5 times. So we need to remove<br style="user-select: auto;">any four 2.</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">The task is to complete the function&nbsp;<strong style="user-select: auto;">removeDuplicates</strong>() which takes the head of input linked list as input. The function should remove the duplicates from linked list and return the head of the linkedlist.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity</strong> : O(N)<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxilliary Space</strong> : O(1)</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1 &lt;= Number of nodes &lt;= 10<sup style="user-select: auto;">5</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Microsoft</code>&nbsp;<code>OYO Rooms</code>&nbsp;<code>Oracle</code>&nbsp;<code>Visa</code>&nbsp;<code>Adobe</code>&nbsp;<code>Myntra</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Linked List</code>&nbsp;<code>Data Structures</code>&nbsp;