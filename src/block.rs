use sha2::{Sha256, Digest}; 
#[derive(Debug)]
pub struct Block { 
    pub index: u32,
    pub previous_hash: String, 
    pub timestamp: u64,
    pub data: String, 
    pub nonce: u64, 
    pub hash: String,
}
impl Block {
pub fn calculate_hash(Cself) -> String { 
    let mut hasher = Sha256::new();
    let input = format!( 
        "{}{}{}{}{}",
    self.index, self.previous_hash, self.timestamp, self.data, self.nonce
);
hasher.update(input);
format!("{:x}", hasher.finalize())
}
pub fn mine_block(Cmut self, difficulty: usize) {
let target = "0".repeat(difficulty); // Difficulty target while Cself.calculate_hash()[..difficulty] != target {
self.nonce += 1;
self.hash = self.calculate_hash();
}
println!("Block mined: {}", self.hash);
}
}