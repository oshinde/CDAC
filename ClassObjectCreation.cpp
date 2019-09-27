#include<iostream>
using namespace std;
class Omkar{			//class creation
private:				//access specifiers
	int id;
	char name[20];
	int rank;
public:					//methods
	void setId(int k){
		id=k;
	}
	void setName(char e[20]){
		name[20]=e[20];
	}
	int getId(){
	return id;
	}
	char getName(){
		return name[20];
	}
	void setRank(int);
	int getRank();
};														
void Omkar::setRank(int a){     //accessing methods outside class using this
	this->rank=a;
};								
int Omkar::getRank(){
	return rank;

};
void main(){
Omkar m;						//object creation normal	
m.setId(20);
m.setRank(30);
cout<<m.getId()<<"\t"<<m.getRank()<<"normal wala"<<endl;
Omkar m2[3];					//array of objects	
for(int i=0;i<3;i++){
	int num1,num2;
	cout<<"enter 3 records now!!";
	cin>>num1>>num2;
	m2[i].setId(num1);
	m2[i].setRank(num2);
}
for(int j=0;j<3;j++){
	cout<<m2[j].getId()<<"\t"<<m2[j].getRank()<<"\t"<<"array of obj wala"<<endl;
}
Omkar *m3=new Omkar;			//object creation using pointer
m3->setId(200);
m3->setRank(300);
cout<<m3->getId()<<"\t"<<m3->getRank()<<"\t"<<"object creation using pointer";
int ref;
cout<<"how many records?";
cin>>ref;
cout<<"enter "<<ref<<"records";
Omkar *m4=new Omkar[ref];		//Dynamic array creation using pointer as a reference
m.setId(20);
m.setRank(30);
for(int i=0;i<ref;i++){
	int num3,num4;
	cin>>num3>>num4;
	m4[i].setId(num3);
	m4[i].setRank(num4);
}
for(int j=0;j<ref;j++){
	cout<<m4[j].getId()<<"\t"<<m4[j].getRank()<<"\t"<<"Dynamic array";
}
delete m3;
delete []m4;

}