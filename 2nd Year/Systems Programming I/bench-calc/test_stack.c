int main() {

struct double_stack * this = createStack(100);

push(stack, 10);
push(stack, 20);
push(stack, 30);

printf("%d popped from stack\n", pop(stack));

return 0;

} // end of main
