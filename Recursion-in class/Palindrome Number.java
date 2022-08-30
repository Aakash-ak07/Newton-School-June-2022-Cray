static boolean isPalindrome(int n)
{
  int rev = 0, reminder;
  int originalNum = n;
  while (n != 0) 
  {
    reminder = n % 10;
    rev = rev * 10 + reminder;
    n /= 10;
  }
  if(originalNum == rev)
  return true;
  else
  return false;
}


// Sample Input:
// 121

// Sample Output:
// true
