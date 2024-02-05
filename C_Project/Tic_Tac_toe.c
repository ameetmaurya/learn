#include <stdio.h>


void printBoard();
int checkWin();
void system();

char board[]={'0','1','2','3','4','5','6','7','8','9'};

void main(){
    int player=1,input,status=-1;
    printBoard();
   

    while (status==-1)
    {
        player=(player%2==0) ? 2 : 1;
       char mark=(player==1) ? 'X' :'O';
        printf("Please enter Number For Player %d\n",player);
        scanf("%d",&input);
    if(input<1 || input>9){
        printf("invalid input");
    }

    board[input]=mark;
    printBoard();

    int result=checkWin();

    if(result==1){
        printf("Player %d is the Winner \nCongratulations\n",player);
        return;
    }else if(result==0){
        printf("draw");
        return;
    }

    player++;
    }
    
    
}

void printBoard(){
    system("cls");
    printf("\n\n\t\t\t\t\t\t\t\t\x1b[33m");
    printf("=== TIC TAC TOE ===\n\n\t\t\t\t\t\t\t\t");
    printf("     |     |     \n\t\t\t\t\t\t\t\t");
    printf("  %c  |  %c  |  %c  \n\t\t\t\t\t\t\t\t",board[1],board[2],board[3]);
    printf("_____|_____|_____\n\t\t\t\t\t\t\t\t");
    printf("     |     |     \n\t\t\t\t\t\t\t\t");
    printf("  %c  |  %c  |  %c  \n\t\t\t\t\t\t\t\t",board[4],board[5],board[6]);
    printf("_____|_____|_____\n\t\t\t\t\t\t\t\t");
    printf("     |     |     \n\t\t\t\t\t\t\t\t");
    printf("  %c  |  %c  |  %c  \n\t\t\t\t\t\t\t\t",board[7],board[8],board[9]);
    printf("     |     |     \n\t\t\t\t\t\t\t\t");
    printf("\n\n");
}


int checkWin(){

    if(board[1]==board[2] && board[2]==board[3]){
        return 1;
    }
    if(board[1]==board[4] && board[4]==board[7]){
        return 1;
    }
    if(board[7]==board[8] && board[8]==board[9]){
        return 1;
    }
    if(board[3]==board[6] && board[6]==board[9]){
        return 1;
    }
    if(board[1]==board[5] && board[5]==board[9]){
        return 1;
    }
    if(board[3]==board[5] && board[5]==board[7]){
        return 1;
    }
    if(board[2]==board[5] && board[5]==board[8]){
        return 1;
    }
    if(board[4]==board[5] && board[5]==board[6]){
        return 1;
    }
    

    int count=0;
    for (int i = 1; i <=9; i++)
    {
        if(board[i]=='X' || board[i]=='O'){
            count++;
        }
    }
    
    if(count==9){
        return 0;
    }
    return -1;
}