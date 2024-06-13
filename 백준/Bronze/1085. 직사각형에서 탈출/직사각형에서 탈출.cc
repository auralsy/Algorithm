#include <iostream>
using namespace std;

int main()
{
	int x, y, w, h;

	cin >> x >> y >> w >> h;

	int l1, l2, k, s;

	l1 = w - x;
	l2 = h - y;
	//l1,l2,x,y 비교하면 된다.

	if (l1 > x)
		k = x;
	else if (l1 < x)
		k = l1;
	else
		k = x;

	if (l2 > y)
		s = y;
	else if (l2 < y)
		s = l2;
	else
		s = y;

	if (k > s)
		cout << s;
	else if (k < s)
		cout << k;
	else
		cout << s;
}