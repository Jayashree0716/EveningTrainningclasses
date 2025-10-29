#include<stdio.h>
#include<stdlib.h>
struct Node {
	int data;
	struct Node* prev;
	struct Node* next;
};

struct Node* head = NULL;

//Function to create a new node
struct Node* createNode(int data) {
	struct Node* newNode = (struct Node*)malloc (sizeof(struct Node));
	newNode->data = data;
	newNode->prev = newNode->next = NULL;
	return newNode;
}

//Insert at end
void insertEnd(int data) {
	struct Node* newNode = createNode(data);
	if (head==NULL) {
		head =newNode;
		return;
	}
	struct Node* temp = head;
	while (temp->next != NULL)
	temp = temp->next;
	
	temp->next = newNode;
	newNode->prev = temp;
}

//Insert at beginning
void insertBeginning(int data) {
	struct Node* newNode = createNode(data);
	
	
	if (head==NULL) {
	head = newNode;
	return;
}
newNode->next = head;
head->prev = newNode;
head = newNode;
}

// Delete from beginning
void deleteBeginning() {
	if (head == NULL) {
		printf("List is empty\n");
		return ;
	}
	struct Node* temp = head;
	head = head->next;
	if (head != NULL)
	head->prev = NULL;
	free(temp);
}

// Delete from end
void deleteEnd() {
	if (head == NULL) {
		printf("List is empty\n");
		return;
	}
	struct Node* temp = head;
	while (temp->next != NULL)
	temp = temp->next;
	
	if (temp->prev)
    	temp->prev->next = NULL;
	else 
	    head = NULL; //only onr node
	   
	    free(temp);
}

//Display list
void display() {
	struct Node* temp = head;
	if (temp == NULL) {
		printf("List is empty\n");
		return;
	}
	printf("Double Linked List: ");
	while (temp != NULL) {
		printf("%d <->", temp->data);
		temp = temp->next;
	}
	printf("NULL\n");
}

// Main menu
int main() {
	int choice, data;
	
	while (1) {
		printf("\nMENU\n");
		printf("1. Insert at End\n2. Insert at Beginning\n3. Delete from Beginning\n4. Delete from End\n5. Display\n6. Exit\n");
		printf("Enter your choice: ");
		scanf("%d", &choice);
		
		switch (choice) { 
		case 1:
		   	printf("Enter data to insert at end: ");
		   	scanf("%d", &data);
		   	InsertEnd(data);
		   	break; 
		case 2:
		   	printf("Enter data to insert at Beginning: ");
		   	scanf("%d", &data);
		   	InsertBeginning(data);
		   	break;
		case 3:
		   	deletebeginning();
		   	break;
		case 4:
		   	deleteEnd();
		   	break;
		case 5:
		   	display();
		   	break;
		case 6:
		   	Exit();
		default:
		   		printf("Invalid choice\n");
		}
	}
	return 0;
}

