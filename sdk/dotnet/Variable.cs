// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Nomad
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// Creating a variable in the default namespace:
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Nomad = Pulumi.Nomad;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Nomad.Variable("example", new()
    ///     {
    ///         Path = "some/path/of/your/choosing",
    ///         Items = 
    ///         {
    ///             { "example_key", "example_value" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// Creating a variable in a custom namespace:
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Nomad = Pulumi.Nomad;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Nomad.Namespace("example", new()
    ///     {
    ///         Name = "example",
    ///         Description = "Example namespace.",
    ///     });
    /// 
    ///     var exampleVariable = new Nomad.Variable("example", new()
    ///     {
    ///         Path = "some/path/of/your/choosing",
    ///         Namespace = example.Name,
    ///         Items = 
    ///         {
    ///             { "example_key", "example_value" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [NomadResourceType("nomad:index/variable:Variable")]
    public partial class Variable : global::Pulumi.CustomResource
    {
        /// <summary>
        /// `(map[string]string: &lt;required&gt;)` - An arbitrary map of items to create in the variable.
        /// </summary>
        [Output("items")]
        public Output<ImmutableDictionary<string, object>> Items { get; private set; } = null!;

        /// <summary>
        /// `(string: "default")` - The namepsace to create the variable in.
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        /// <summary>
        /// `(string: &lt;required&gt;)` - A unique path to create the variable at.
        /// </summary>
        [Output("path")]
        public Output<string> Path { get; private set; } = null!;


        /// <summary>
        /// Create a Variable resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Variable(string name, VariableArgs args, CustomResourceOptions? options = null)
            : base("nomad:index/variable:Variable", name, args ?? new VariableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Variable(string name, Input<string> id, VariableState? state = null, CustomResourceOptions? options = null)
            : base("nomad:index/variable:Variable", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "items",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Variable resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Variable Get(string name, Input<string> id, VariableState? state = null, CustomResourceOptions? options = null)
        {
            return new Variable(name, id, state, options);
        }
    }

    public sealed class VariableArgs : global::Pulumi.ResourceArgs
    {
        [Input("items", required: true)]
        private InputMap<object>? _items;

        /// <summary>
        /// `(map[string]string: &lt;required&gt;)` - An arbitrary map of items to create in the variable.
        /// </summary>
        public InputMap<object> Items
        {
            get => _items ?? (_items = new InputMap<object>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, object>());
                _items = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// `(string: "default")` - The namepsace to create the variable in.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - A unique path to create the variable at.
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        public VariableArgs()
        {
        }
        public static new VariableArgs Empty => new VariableArgs();
    }

    public sealed class VariableState : global::Pulumi.ResourceArgs
    {
        [Input("items")]
        private InputMap<object>? _items;

        /// <summary>
        /// `(map[string]string: &lt;required&gt;)` - An arbitrary map of items to create in the variable.
        /// </summary>
        public InputMap<object> Items
        {
            get => _items ?? (_items = new InputMap<object>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, object>());
                _items = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// `(string: "default")` - The namepsace to create the variable in.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// `(string: &lt;required&gt;)` - A unique path to create the variable at.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        public VariableState()
        {
        }
        public static new VariableState Empty => new VariableState();
    }
}
