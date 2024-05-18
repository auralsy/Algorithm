#include <iostream>
using namespace std;

int main()
{
	int arr[6] = { 1, 1, 2, 2, 2, 8 };
	int arr1[6];

	for (int i = 0; i < 6; i++)
	{
		cin >> arr1[i];
	}

	for (int i = 0; i < 6; i++)
	{
		if (arr[i] == arr1[i])
		{
			arr1[i] = 0;
		}
		else
			arr1[i] = arr[i] - arr1[i];
	}
	cout << arr1[0] << ' ' << arr1[1] << ' ' << arr1[2] << ' ' << arr1[3] << ' ' << arr1[4] << ' ' << arr1[5];
}