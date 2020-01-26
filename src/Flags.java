/**
 * Command line flags
 */
public class Flags {
    /**
     * No garbage collection
     */
    public static final int GC_NOGC = 0;

    /**
     * Generational garbage collection
     */
    public static final int GC_GENGC = 1;

    /**
     * Stop-and-copy garbage collection
     */
    public static final int GC_SNCGC = 2;

    /**
     * Normal GC operation
     */
    public static final int GC_NORMAL = 3;

    /**
     * Test GC operation
     */
    public static final int GC_TEST = 4;

    /**
     * Quick GC debugging
     */
    public static final int GC_QUICK = 5;

    /**
     * Full GC debugging
     */
    public static final int GC_DEBUG = 6;

    /**
     * Garbage collector flag (default GC_NOGC)
     *
     * @see #GC_NOGC
     */
    public static int cgen_Memmgr = GC_NOGC;

    /**
     * Garbage collector testing flag (default GC_NORMAL)
     *
     * @see #GC_NORMAL
     */
    public static int cgen_Memmgr_Test = GC_NORMAL;

    /**
     * Garbage collector debugging flag (default GC_QUICK)
     *
     * @see #GC_NOGC
     */
    public static int cgen_Memmgr_Debug = GC_QUICK;

    /**
     * Code optimization flag
     */
    public static boolean cgen_optimize = false;

    /**
     * Output filename
     */
    public static String out_filename = null;

    /**
     * First input filename
     */
    public static String in_filename = null;

    public static boolean lexer_only = false;

    public static boolean recover = false;
    
    /**
     * Enable lexer debugging
     */
    public static boolean lexer_debug = false;

    /**
     * Enable parser debugging
     */
    public static boolean parser_debug = false;

    /**
     * Enable semantic analysis debugging
     */
    public static boolean semant_debug = false;

    /**
     * Enable code gen debugging
     */
    public static boolean cgen_debug = false;

    /**
     * Verbose
     */
    public static int verbose = 0;

    /**
     * Disable register allocation
     */
    public static boolean disable_reg_alloc = true;

    /**
     * Processes command line flags and extracts filenames to be compiled
     *
     * @param args the argument array passed to main()
     * @return an array of filenames to be compiled
     */
    public static String[] handleFlags(String args[]) {
        int filecnt = 0;
        boolean unknownopt = false;
        for (int i = 0; i < args.length; i++) {
            if (args[i] != null) {
                if (args[i].charAt(0) == '-') {
                    if (args[i].length() != 2) {
                        System.err.println("Error in \"" + args[i] + "\".  frontend.Flags must be specified one at a time.\n");
                        System.exit(1);
                    }
                    // this is a flag
                    switch (args[i].charAt(1)) {
                        case 'g':
                            cgen_Memmgr = GC_GENGC;
                            break;
                        case 't':
                            cgen_Memmgr_Test = GC_TEST;
                            break;
                        case 'T':
                            // sm: this was disabled .. don't know why
                            cgen_Memmgr_Debug = GC_DEBUG;
                            break;
                        case 'o':
                            if ((i + 1) < args.length) {
                                out_filename = args[i + 1];
                                args[i + 1] = null;
                            } else {
                                unknownopt = true;
                            }
                            break;
                        case 'O':
                            cgen_optimize = true;
                            break;
                        case 'l':
                            lexer_debug = true;
                            verbose++;
                            break;
                        case 'p':
                            parser_debug = true;
                            verbose++;
                            break;
                        case 's':
                            semant_debug = true;
                            verbose++;
                            break;
                        case 'c':
                            cgen_debug = true;
                            verbose++;
                            break;
                        case 'x':
                            lexer_only = true;
                            break;
                        case 'r':
                            recover = true;
                            break;
                        default:
                            unknownopt = true;
                            break;
                    }
                    args[i] = null;
                } else {
                    // this is a filename, save the first name we see
                    if (in_filename == null) in_filename = args[i];
                    filecnt++;
                }
            }
        }

        if (unknownopt) {
            Utilities.fatalError("Unknown arguments");
            System.err.println("usage: <program> [-OgtT -o outname] [input-files]\n");
            System.exit(1);
        }

        String[] res = new String[filecnt];
        int ind = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] != null) {
                res[ind++] = args[i];
            }
        }
        return res;
    }
}
