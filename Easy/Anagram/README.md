<h2><a href="https://www.geeksforgeeks.org/problems/anagram-1587115620/1?page=1&category=Strings&sortBy=submissions">Anagram</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given two strings&nbsp;<strong style="user-select: auto;">a&nbsp;</strong>and&nbsp;<strong style="user-select: auto;">b&nbsp;</strong>consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other. Strings <strong style="user-select: auto;">a</strong> and <strong style="user-select: auto;">b&nbsp;</strong>can only contain lower case alphabets.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note:-</strong> </span></p>
<ul style="user-select: auto;">
<li style="user-select: auto;">
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">If the strings are anagrams you have to <strong style="user-select: auto;">return True or else return False</strong></span></p>
</li>
<li style="user-select: auto;">
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">|s| </strong>represents the length of string s.</span></p>
</li>
</ul>
<p style="user-select: auto;"><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>a = geeksforgeeks, b = forgeeksgeeks
<strong style="user-select: auto;">Output: </strong>YES
<strong style="user-select: auto;">Explanation: </strong>Both the string have same characters with
        same frequency. So, both are anagrams.</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>a = allergy, b = allergic
<strong style="user-select: auto;">Output: </strong>NO
<strong style="user-select: auto;">Explanation: </strong>Characters in both the strings are 
&nbsp;       not same, so they are not anagrams.</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong></span><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">You don't need to read input or print anything. Your&nbsp;</span><span style="font-size: 18px; user-select: auto;">task is to complete the function&nbsp;<strong style="user-select: auto;">isAnagram()</strong> which takes the string <strong style="user-select: auto;">a</strong> and string <strong style="user-select: auto;">b</strong> as input parameter and check if the two strings are an anagram of each other. The function returns true if the strings are anagram else it returns false.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>O(|a|+|b|).<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(Number of distinct characters).</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1 ≤ |a|,|b| ≤ 10<sup style="user-select: auto;">5</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Directi</code>&nbsp;<code>Adobe</code>&nbsp;<code>Google</code>&nbsp;<code>Nagarro</code>&nbsp;<code>Media.net</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;<code>Sorting</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;