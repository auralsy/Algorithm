#include <iostream>
using namespace std;

int main()
{
	int w, h;

	cin >> w;
	cin >> h;

	for (int i = 1; i <= w; i++)
	{
		for (int i = 1; i <= h; i++)
		{
			cout << '*';
		}
		cout << '\n';
	}
}