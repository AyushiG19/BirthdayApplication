
#include<bits/stdc++.h>
using namespace std;
void addEdge(vector<int> arr[],int u,int v)
{
	arr[u].push_back(v);
	arr[v].push_back(u);
}
void printGraph(vector<int> arr[], int V)
{
	for(int i=0;i<V;i++)
	{
		cout<<"i: ";
		for(int x:arr[i])
		
		cout<<"x ";
	
	cout<<"\n";
}
int main()
{ 
int V=5;
vector<int> arr[5];
addEdge(arr,0,1);
addEdge(arr,0,2);
addEdge(arr,1,2);
addEdge(arr,1,3);
addEdge(arr,2,3);
addEdge(arr,2,4);
addEdge(arr,3,4);
printGraph(arr,V);
return 0;
}