using Pulumi;
using Nomad = Pulumi.Nomad;

class MyStack : Stack
{
    public MyStack()
    {
        var ns = new Nomad.Namespace("test-ns-cs", new Nomad.NamespaceArgs{});

        this.NamespaceName = ns.Name;
    }

    [Output] public Output<string> NamespaceName { get; set; }
}
