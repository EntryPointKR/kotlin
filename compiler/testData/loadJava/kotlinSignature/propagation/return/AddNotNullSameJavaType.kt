package test

public trait AddNotNullSameJavaType: Object {

    public trait Super: Object {
        public fun foo(): CharSequence?
    }

    public trait Sub: Super {
        override fun foo(): CharSequence
    }
}