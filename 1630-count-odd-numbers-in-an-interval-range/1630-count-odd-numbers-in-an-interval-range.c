

int countOdds(int low, int high){
    
        return (high + 1) / 2 - low / 2;
}

// 3 - 7 --> 5 numbers - 3 odd (3,5,7)
// 4 - 8 --> 5 numbers - 2 odd ( 5,7)
// 3 - 8 --> 6 numbers - 3 odd (3,5,7)
// 4 - 7 --> 4 numbers - 2 odd (5,7)