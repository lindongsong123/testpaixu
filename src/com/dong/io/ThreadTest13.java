package com.dong.io;
/*
	以下程序使用线程同步机制保证数据的安全。
*/
public class ThreadTest13
{
    public static void main(String[] args){

        //创建一个公共的账户
        Account act = new Account("actno-001",5000.0);

        //创建线程对同一个账户取款
        Thread t1 = new Thread(new Processor(act));
        Thread t2 = new Thread(new Processor(act));

        t1.start();

        t2.start();
    }
}

//取款线程
class Processor implements Runnable
{
    //账户
    Account act;

    //Constructor
    Processor(Account act){
        this.act = act;
    }

    public void run(){
        act.withdraw(1000.0);
        System.out.println("取款1000.0成功，余额：" + act.getBalance());
    }
}

//账户
class Account
{
    private String actno;
    private double balance;

    public Account(){}
    public Account(String actno,double balance){
        this.actno = actno;
        this.balance = balance;
    }

    //setter and getter
    public void setActno(String actno){
        this.actno = actno;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getActno(){
        return actno;
    }

    public double getBalance(){
        return balance;
    }

    //对外提供一个取款的方法
    public void withdraw(double money){ //对当前账户进行取款操作

        //把需要同步的代码，放到同步语句块中.
		/*
			原理：t1线程和t2线程.
			t1线程执行到此处，遇到了synchronized关键字，就会去找this的对象锁，
			如果找到this对象锁，则进入同步语句块中执行程序。当同步语句块中的代码
			执行结束之后，t1线程归还this的对象锁。

			在t1线程执行同步语句块的过程中，如果t2线程也过来执行以下代码，也遇到
			synchronized关键字，所以也去找this的对象锁，但是该对象锁被t1线程持有，
			只能在这等待this对象的归还。
		*/
        synchronized(this){

            double after = balance - money;

            //延迟
            try{Thread.sleep(1000);}catch(Exception e){}


            //更新
            this.setBalance(after);
        }

    }
}