<div>

#### Type Prefixes

<ul>
    <li>I: Integer</li>
    <li>F: Float</li>
    <li>DO: Double</li>
    <li>DE: Decimal</li>
    <li>L: Long</li>
    <li>S: String</li>
    <li>C: Char</li>
    <li>B: Boolean</li>
    <li>T: Custom Type</li>
</ul>

#### Scope Prefixes
<ul>
    <li>L: Local Variable</li>
    <li>G: Global Property</li>
    <li>S: Global Static Property</li>
    <li>C: Global Constant</li>
    <li>SC: Global Static Constant</li>
    <li>HSC: Hard-Coded Global Static Constant</li>
</ul>

#### Method Type Prefixes

<ul>
    <li><p>GE: (Get) Short retrieval time, should return already existing local/global variable</p></li>
    <li><p>FI: (Find) Longer retrieval time, used to get objects that are not easily availible</p>
    <li><p>CR: (Create) Create a new object</p></li>
    <li><p>LI: (List) Provides a list of the specified type, or an empty list if none are present. May return an <code>Iterator</code>, <code>Stream</code>, <code>Sequence</code> etc..</p></li>
    <li><p>SE: (Search) Does some kind of active search by given values. May also search by vague criteria like patterns, search queries etc</p></li>
    <li><p>LO: (Load) Inditaces that getting the operation may involve costly I/O (disk access, database round trip, web service call).</p></li>
</ul>

#### Method Modifiers

<ul>
    <li><p>S: (Standard) Normal method</p></li>
    <li><p>TR: (Try) Method can (fail/return NULL)</p></li>
</ul>

#### Variable Name Rules
<div><ul>
    <li><p>All variable names should follow this syntax:</p>
    <p><code><strong>{scope-prefix}_{type-prefix}_{variable-name}</strong></code></p></li>
    <li><p>Names of variables <strong>MUST</strong> always be capitalized</p></li>
    <li><p>Spaces in variable names should be replaced with underscores</p></li>
</ul></div></div>

#### Method Name Rules
<div><ul>
    <li><p>All methods name should follow this syntax:</p>
    <p><code><strong>{method-modifier}_{type-prefix}_{method-type}_{method-name}</strong></code></p></li>
    <li><p>Names of methods <strong>MUST</strong> always be capitalized</p></li>
    <li><p>Spaces in methods names should be replaced with underscores</p></li>
</ul></div>
