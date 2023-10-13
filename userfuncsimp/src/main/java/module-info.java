import userfuncs.binaryfuncs.BinFuncProvider;

module userfuncsimp {
    requires userfuncs;
    provides BinFuncProvider with
            userfuncsimp.binaryfuncsimp.AbsPlusProvider,
            userfuncsimp.binaryfuncsimp.AbsMinusProvider;
}