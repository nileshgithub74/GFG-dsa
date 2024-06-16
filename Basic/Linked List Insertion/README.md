<h2><a href="https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1?page=1&category=Linked%20List&sortBy=submissions">Linked List Insertion</a></h2><h3>Difficulty Level : Basic</h3><hr><div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Create a link list of size N according to the given input literals. Each integer input is accompanied by an indicator which can either be 0 or 1. If it is 0, insert the integer in the beginning of the link list.&nbsp;If it is 1, insert the integer at the end of the link list.&nbsp;</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Hint: </strong>When inserting at the end, make sure that you handle NULL explicitly. </span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>LinkedList: 9-&gt;0-&gt;5-&gt;1-&gt;6-&gt;1-&gt;2-&gt;0-&gt;5-&gt;0
<strong style="user-select: auto;">Output: </strong>5 2 9 5 6<strong style="user-select: auto;">
Explanation:
</strong>Length of Link List = N = 5
9 0&nbsp;indicated that 9 should be
inserted in the beginning. Modified
Link List = 9.
5 1&nbsp;indicated that 5&nbsp;should be
inserted in the end.&nbsp;Modified Link
List = 9,5.
6 1 indicated that 6&nbsp;should be
inserted in the end.&nbsp;Modified Link
List = 9,5,6.
2 0&nbsp;indicated that 2&nbsp;should be
inserted in the beginning.&nbsp;Modified
Link List = 2,9,5,6.
5 0&nbsp;indicated that 5&nbsp;should be
inserted in the beginning.&nbsp;Modified
Link List = 5,2,9,5,6.&nbsp;
Final linked list =&nbsp;5, 2, 9, 5, 6.<strong style="user-select: auto;">
</strong></span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>LinkedList: 5-&gt;1-&gt;6-&gt;1-&gt;9-&gt;1
<strong style="user-select: auto;">Output: </strong>5 6 9<strong style="user-select: auto;">
</strong></span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You only need to complete the <strong style="user-select: auto;">functions insertAtBeginning()&nbsp;</strong>and </span><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">insertAtEnd()</strong></span><span style="font-size: 18px; user-select: auto;">&nbsp;that takes the head of link list and integer value of the data to be inserted as inputs and returns the head of the modified link list.&nbsp;</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(1) for&nbsp;<strong style="user-select: auto;">insertAtBeginning()&nbsp;</strong>and O(N) for&nbsp;<strong style="user-select: auto;">insertAtEnd()</strong>.<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(1) for both.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= N &lt;= 10<sup style="user-select: auto;">4</sup></span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Hike</code>&nbsp;<code>Wipro</code>&nbsp;<code>TCS</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Linked List</code>&nbsp;<code>Data Structures</code>&nbsp;