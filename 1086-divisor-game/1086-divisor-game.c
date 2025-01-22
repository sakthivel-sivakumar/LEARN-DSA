bool divisorGame(int n) 
{
   return n%2 == 0; 
}
/*
n 
1 --> Lose
2 --> (1) --> Win
3 --> (1) --> 2  --> Lose
4 --> (2) --> 2 --> win
5 --> (1) --> 4 --> Lose
*/