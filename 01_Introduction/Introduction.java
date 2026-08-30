//?Why we need Java ?? ==> Before Java C/C++ languages were there,During 1980/90's C/C++ was very famous because It was fast, simple and low level Language [close to hardware]

//&Why Java ?? ==> There was the problem of portability in the languages like C/C++.

//?How change in the Operating System differs the binary code ??? ==> Let say in your c++ code you have tried to print something.When you are trying to print something onto the console what you are doing is you are giving command to the operating system that I want to print something onto the console.You must have given some command to the operating system to print something onto the console.

//~Let say you want to perform read operation in a file.In this case you have to talk to an operating system.Let say You want to allocate some memory to the variables.For doing all these things you have to talk to an operating System.

//*But In C++ you only have written cout << "Hello World" << endl;When you basically compile this, then OS Basically provides you it's system libraries in the compiled form.These are the methods present in the system Libraries if you call them then anything would be printed onto the console.After the compilation Machine code contains the code of the system libraries as well.

//^Now It can be possible that your p1 platform where you have used windows.Let say writeFile is the method present in the system Libraries that you have to call to read a file.Similarly WriteToConsole().Now let say same thing If I have to do in MAC ==> let say my method is WriteThere().Methods which are given by the windows to call in form of system libraries would be very different from the methods provided by the MAC.That means binary of WriteToConsole would be very different from the binary of WriteThere().


//?Because OF Processor How Binary code can differ ?? ==> A processor is CPU, brain of the computer.Inside processor there are billions of transistors.In transistors either current goes [1] or current not goes [0].On or off. 1s and 0s.Intel and ARM when they had made their processors then they would have placed their transistors according to their own choice, acc to their own place,they must have placed chips very differently.CPU has contains many pins p1, p2 and so on... these pins will be very different in Intel and ARM.

//~ Let say If I want to interact with Intel and my code says add two numbers then at the hardware level we will give different binaries to interact with Intel Pins and different binaries to interact with ARM Pins.

//*If your program wants to interact with the processor then in between them there is a thing called ISA ==> Instruction Set Architecture.It how to perform ADD, LOAD, STORE, JUMP operations in a processor.Now your proccessors are different then your ISA's would also be different.ISA is like a grammer for any processor.

//*These are the platform Dependant Languages.

//? Problem of simplicicty in c/c++.

//^Security ==> C/C++ languages were less secure.

//^These all things led to the birth of Java Language.

//?How Java solved the problem of platfom Dependant ?? ==> For this Java brought the concept of BYTE CODE.

//?Java achieves platform independence—the ability for code to run on any device regardless of the underlying operating system or processor—primarily through its use of ByteCode and the Java Virtual Machine (JVM).

//*Compilation to ByteCode ==>  Unlike languages like C or C++ that compile directly into platform-specific machine code, the Java compiler converts your source code (.java files) into an intermediate, universal format called ByteCode (.class files). This ByteCode is the same regardless of where it was compiled.

//*The Role of the JVM ==>  The JVM acts as a translator. Because every platform (e.g., Windows, macOS, Linux on different CPU architectures) has its own specific JVM installed, the JVM reads the universal ByteCode and converts it into the machine-specific instructions required by that particular host platform at runtime.

//^ Write Once, Run Anywhere ==>  This architecture, often referred to by the acronym WORA, means developers only need to write and compile their code once. The specific JVM on the target system handles the complexities of hardware communication, ensuring the program runs consistently everywhere.

//!Java ==> 1.Portable 2.Simple 3.Secure.

//!C/C++ ==> Pointers, Multiple Inheritance, Manual Memory allocate/deallocate.Java removes all these,Java does'not need these three.


//! ByteCode enhances **Java's security** primarily by acting as a safeguard within the **Java Virtual Machine (JVM)** (33:52). Instead of running raw machine code directly on the processor—which could allow a program to manipulate hardware or memory arbitrarily—the JVM executes the intermediate **ByteCode** within a highly restricted, managed environment known as the **Sandbox Model** (53:03 - 53:22).

// !Key security benefits of this architecture include:

// * **Restricted Access:** The JVM monitors the execution of ByteCode and prevents it from performing unauthorized actions, such as accessing sensitive system files or crashing the operating system (51:42 - 53:08).
// * **Verification:** The JVM verifies the integrity of the ByteCode before execution, ensuring that the code does not violate language safety rules or attempt malicious memory operations.
// * **Isolation:** By using the **Sandbox Model**, Java creates a layer of isolation between the application and the underlying host system, which was historically critical for running untrusted code safely, such as in early *Java Applets* (50:46 - 53:22).


