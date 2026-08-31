//?JVM work is to translate byte code into the machine code.

//? JVM Is a virtual machine / virtual computer.It is basically an environment inside which our byte code runs.Byte code is basically a intermediate Code.How JVM converts this bytecode into machine code [0's and 1's]?To convert any source code or machine code into byte code we need some compiler/software.Now at this stage we have 2 kinds of software i.e Compiler And Interpretor.

//*The distinction between a compiler and an interpreter lies in how they transform your source code into the machine code (the zeros and ones) that a computer's CPU can actually process

//*A compiler processes the entire source code at once.It reads the full program, translates the entire file into a single block of machine code, and then hands that completed machine code to the system. Finally, the CPU executes this finished code to produce an output.

//*An interpreter works differently by processing code line-by-line. Instead of translating everything at once, it takes one line of source code, converts it into machine code, and immediately hands that specific line to the CPU to run.Once the CPU executes that line and produces an output, the interpreter moves to the next line and repeats the process.

//* Java is both compiled + Interpreted Language.

//^ Why during 1990's JVM uses interpretor to convert byte code into machine code, expain it in detail

//^During the 1990s, when Java was first gaining popularity, the JVM (Java Virtual Machine) relied heavily on an interpreter rather than a full compiler to execute bytecode. This decision was driven by the specific hardware and software limitations of that era 

//^Hardware Constraints: In the 1990s, computers had slower processors and limited RAM compared to modern systems.Using a full-scale compiler to translate code into machine instructions before execution would have created a significant delay, making the software feel sluggish from the user's perspective.

//& Startup Speed: The primary goal was to ensure that a Java program could begin execution as quickly as possible.An interpreter achieves this by reading and converting just one line of bytecode at a time, allowing the system to start running the program immediately without waiting for the entire application to be compiled first.

//& Managing Two-Step Conversion: Java already uses a two-step process: source code is compiled into bytecode,and then the JVM converts bytecode into machine code.Adding a full compilation step inside the JVM would have compounded the resource overhead, which was unsustainable given the slow disk speeds and limited memory available at the time.

//! Modern Optimization (JIT Compiler):
//! To improve speed, modern JVMs incorporate a JIT (Just-In-Time) compiler.It identifies frequently used parts of your code and compiles them directly into native machine code, bypassing the line-by-line interpretation for those sections to boost performance, while the rest of the code is still handled by the interpreter.


//! JVM ==> 1.Converts Bytecode to MC [Interpretor + JIT Compiler].
//!2. Security [Sand-box-model]
//!3. Garbage Collection is also the work of the Java Virtual Machine.

//~The JVM (Java Virtual Machine) ensures security primarily by acting as a protective barrier between your Java bytecode and your computer's actual hardware.Here is how it works in simple terms:

//~ The Sandbox Model: The JVM creates a controlled, restricted environment—often called a "sandbox"—where your Byte Code runs.

//~ Isolation from System: Because the Byte Code runs inside this virtual machine rather than directly on the operating system, it cannot easily access or modify sensitive system files, delete data, or install malicious software.

//~ Monitoring Access: The JVM constantly monitors what the bytecode is trying to do. If a program attempts to perform an action it isn't authorized for (like accessing restricted memory or system resources), the JVM can block it, preventing potential harm to your computer.

//~ Essentially, the JVM treats downloaded or external code as potentially untrusted and keeps it contained within its own safe space so it cannot interfere with your wider system.

//! JRE [Java RunTime Environment]==> JVM + class Libraries

//! The JRE, or Java Runtime Environment, is the essential software layer required to run Java applications on your computer.It acts as the execution engine for your code.

//! JVM (Java Virtual Machine): The heart of the JRE. It is responsible for taking your compiled bytecode and translating it line-by-line into machine-specific code that your computer's CPU can execute.

//!Class Libraries: These are pre-written sets of code and functions (like those used to print output to your screen or handle files) that your Java program needs to perform various tasks.

//!Think of the JRE as a complete package that combines the JVM and these class libraries to ensure that once you have a Java program, it can be executed on any system that has the JRE installed.

//!Alone JVM without JRE cannot do file read operations or printing something onto the console.

//? JDK [Java Development Kit] => JRE + Compiler [that converts java source program into Byte Code] / Debugger / Java Docs.

//?You need to install JDK [Java Development Kit] into your system.

//? JSE = Java Standard Edition. [Core Java]
//? JEE => Java Enterprise Edition/Jakarta Enterprise Edition.Using Java for making web Apps.we have added new classes and libraries inside Java forex ==> Transactionals etc. for running web Applications.
//? JME => Java Micro Edition.Light Weight Edition Of Java.

//? javac Demo.js ===> this command is used for compiling the java code into byte code i.e demo.class

//! java Demo ==> for running byte code by JRE.