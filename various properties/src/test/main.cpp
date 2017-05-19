#include <iostream>
#include <stdexcept>
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

double compute(double x, double y)
{
	if(y == 0)
	{
		throw invalid_argument("divisor is 0");
	}
	return x / y;
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

	cout << compute(10, 5) << endl;
	cout << compute(10, 0) << endl;
	cout << "after" << endl;
}



