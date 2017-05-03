#include <iostream>
using namespace std;

class Parent
{
public:
	Parent();
	virtual ~Parent();
	virtual int getNum() = 0;
	virtual double getDou() = 0;
	virtual string getStr();
private:
	int num_;
};
Parent::Parent()
{
	num_ = 30;
}

Parent::~Parent()
{

}

string Parent::getStr()
{
	return "parent string";
}

class Child : public Parent
{
public:
	Child();
	~Child();
	int getNum();
	double getDou();
	string getStr();
private:
	int num_;
};
Child::Child()
{
	num_ = 5;
}

Child::~Child()
{

}

int Child::getNum()
{
	cout << "in child, ";
	return num_ + 1;
}

double Child::getDou()
{
	cout << "in child, ";
	return num_ + 0.5;
}

string Child::getStr()
{
	return "child string";
}

int main()
{
	cout << "hello c++" << endl;
	Child* c = new Child();
	Parent* p;
	p = c;
	cout << p->getNum() << endl;
	cout << c->getDou() << endl;
	cout << c->getStr() << endl;
	cout << c->Parent::getStr() << endl;
}



