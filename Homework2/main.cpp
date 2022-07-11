#include <iostream>
#include <stdio.h>
#include <string.h>
#include <ctime>
using namespace std;

const char alphanum[] = "0123456789!@#$%^&*abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
int string_length = sizeof(alphanum)-1;
void main_menu();

class Transaction{
public:
  //time_t ttime=time(0);
  //char *dt=ctime(&ttime);
  string date="";
  string type="";
  float amount=0.00;
  int count=0;
  friend class Account;
// for data structres that do not have a limit
// we use constuctors to overload it 
// public:
//   Transaction(){
//   string date="";
//   string type="";
//   float amount=0.00;
//   int count=0;
//   }
//   Transaction(string t, float a){
//   time_t ttime=time(0);
//   char *dt=ctime(&ttime);
//   date=dt;
//   type=t;
//   amount=a;
//   count++;
//   }
public:
void setTranstime(){
  time_t ttime=time(0);
  char *dt=ctime(&ttime);
  dt=strtok(ctime(&ttime), "\n");
  date=dt;
}
void setTranstype(string t){
  type=t;
}
void setTransamount(float a){
  amount=a;
}
string getTranstime(){
  return date;
}
string getTranstype(){
  return type;
}
float getTransamount(){
  return amount;
}

};
//initializa account
class Account: public Transaction{
  public:
  int account_no=0;
  string password= "";
  float balance= 5000.00;
  Transaction trans[10];
  

  
  void setAcc_no(int a){
    account_no=a;
  }
  int getAcc_no(){
  return account_no;
}
  void setPass(string p){
    password=p;  
    
  }
  string getPass(){
    return password;
  }
   void setBalance(float b){
    balance=b;  
    
  }
  float getBalance(){
    return balance;
  }
  void viewBalance(){

cout << "Main Window-->Show Balance"<< endl;
cout << "============="<< endl;
cout << "Your current balace is: $"<<balance<<endl;
cout<<"--------------------------------------"<<endl;
cout <<"Press enter to go back to the main window";
  cin.ignore();
  cin.ignore();
  main_menu();
  
}
void Deposit(){
  float deposit;
  cout << "Main Window-->Deposit (Enter the following informatiojn)"<< endl;
  cout << "===================================="<< endl;
  
  cout<<"the amount you want to deposit is :$";
  cin>> deposit;

  balance+=deposit;
  trans[count].setTranstime();
  trans[count].setTranstype("Deposit ");
  trans[count].setTransamount(deposit);
  //cout<< trans[count].getTranstime();
  count++;
  cout<<"--------------------------------------"<<endl;
  cout <<"Well done. This was added to your balance successfuly...Press enter to go back to the main window"<<endl;
  cin.ignore();
  cin.ignore();
  main_menu();
}
void Withdraw(){
  float withdraw;
   cout << "Main Window-->Withdraw (Enter the following informatiojn)"<< endl;
  cout << "===================================="<< endl;
  
  cout<<"the amount you want to withdraw is :$";
  cin>>withdraw;
  balance-=withdraw;

  trans[count].setTranstime();
  trans[count].setTranstype("Withdraw");
  trans[count].setTransamount(withdraw);
  
  count++;
cout<<"--------------------------------------"<<endl;
  cout <<"Please take your money then..Press enter to go back to the main window"<<endl;
  cin.ignore();
  cin.ignore();
  main_menu();
}
};


void main_menu(){


  
cout << "Main Window"<< endl;
cout << "============="<< endl;
cout << "Choose one of the following options:"<< endl;
cout << "(1)Show balance"<< endl;
cout << "(2)Deposit"<< endl;
cout << "(3)Withdraw"<< endl;
cout << "(4)Show All Transactions"<< endl;
cout << "Enter your choice"<< endl;
  
//scanf("%d", &choice);

//return choice;
    };




int main() {
  cout<<"Generating 10 bank accounts and passwords..."<<endl;
  Account account[10];
  
  srand(time(0));
  
  for (int i=0;i<10;i++){
    account[i].setAcc_no(i+1);
    //cout<<alphanum[rand() % string_length]; alphabet?
    account[i].setPass(to_string(alphanum[rand() % string_length]));
    
    cout<< "Account Number:"<<account[i].getAcc_no()<<endl;
    
    cout<< "Password:"<<account[i].getPass()<<endl;
     }
  int inputacc;
  string inputpass;
  bool isAccountInValid=true;
  
  while(isAccountInValid){
    
  printf("Login Window:\n");
  printf("============\n");
  
  printf("Enter Your Account No:");
  cin>> inputacc;
 
  cout<< "Enter your password:";
  cin>> inputpass;
  int j =0;
  while(j<10){
    if(account[j].getAcc_no()==inputacc && account[j].getPass()==inputpass){
       isAccountInValid=false;
       break;
    }else{
      j++;
  }
    }
    if (isAccountInValid){cout<<"wrong account no/pass, re run the program!"<<endl;
      }
    }  
  int choice=-1;
  main_menu();
  while(choice!=6){
    
    cin>>choice;
    switch(choice){
      case 1:
        account[inputacc-1].viewBalance();
        break;
      case 2:
         account[inputacc-1].Deposit();
        break;
      case 3:
          account[inputacc-1].Withdraw();
      break;
      case 4:
        cout<<"Main Window --> Show All Transactions"<<endl;
        cout<<"=========================================="<<endl;
        cout<<"Account No:"<<inputacc<<endl;
        cout<<"-------------------------------------------------------"<<endl;
        cout<<"Date                         |Type              |Amount"<<endl;
        cout<<"-------------------------------------------------------"<<endl;
        
        for(int i=0;i<account[inputacc-1].count;i++){
          cout<<account[inputacc-1].trans[i].getTranstime()<<"     |"<<account[inputacc-1].trans[i].getTranstype()<<"          |"<<account[inputacc-1].trans[i].getTransamount()<<endl;
        }
         cout<<"-------------------------------------------------------"<<endl;
        cout <<"Press enter to go back to the main window"<<endl;
  cin.ignore();
  cin.ignore();
  main_menu();
          break;
      default:
        cout<<"wrong number, try again!";
        exit(1);
    }
    
    }
  }