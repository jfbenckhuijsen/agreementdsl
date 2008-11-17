package com.atosorigin.nl.jspring2008.xtext.transfer
{
	[Bindable]
	[RemoteClass(alias="com.atosorigin.nl.jspring2008.xtext.transfer.AccountEntryTO")]
	public class AccountEntry
	{
		public var account : String;
		public var occured : Date;
		public var amount : double;
		
		public function AccountEntry () {			
		}

	}
}