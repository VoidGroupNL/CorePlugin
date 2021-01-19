## Variable Prefix Map

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
    <li>CS: Global Static Constant</li>
</ul>

#### Variable Name Rules
<ul>
    <li><p>All variable names should follow this syntax:</p>
    <p><strong>{scope-prefix}_{type-prefix}_{variable-name}</strong></p></li>
    <li><p>Names of global properties <strong>MUST</strong> always be capitalized</p></li>

</ul>
{% highlight javascript %}
function fancyAlert(arg) {
  if(arg) {
    $.facebox({div:'#foo'})
  }
}
{% endhighlight %}
