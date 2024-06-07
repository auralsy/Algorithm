#include <iostream>
using namespace std;

int main()
{
	int a, b, c, d;

	cin >> a;
	cin >> b;
	cin >> c;
	cin >> d;

	int s = 0;
	s = a + b + c + d;

	int k = 0;
	k = (s / 60);

	cout << k << endl;
	cout << (s - k * 60);
}